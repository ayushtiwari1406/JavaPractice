import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		//JsonPath js1 = ReusableMethod.rawToJSON(payload.courseDetails());

		JsonPath jpath = new JsonPath(payload.courseDetails());

		//Print No of courses returned by API

		int courseCount = jpath.getInt("courses.size()");  //size is a method in jsonpath which return count. It is only used with array.
		System.out.println("Course count is: " + courseCount);

		//Print Purchase Amount

		int purchaseAmount = jpath.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount is: " + purchaseAmount);

		//Print Title of the first course

		String firstCourseTitle = jpath.get("courses[0].title");
		System.out.println("Print Title of the first course: " + firstCourseTitle);

		//Print All course titles and their respective Prices

		for(int i=0; i<courseCount; i++) {

			String CourseTitle = jpath.get("courses["+i+"].title");
			System.out.println("Course Title: " + CourseTitle);

			int CoursePrice = jpath.getInt("courses["+i+"].price");
			System.out.println("Course Price: " + CoursePrice);

		}

		//Print no of copies sold by RPA Course

		for(int i=0; i<courseCount; i++) {

			String CourseTitle = jpath.get("courses["+i+"].title");
			if(CourseTitle.equalsIgnoreCase("RPA")) {
				int CourseCopy = jpath.getInt("courses["+i+"].copies");
				System.out.println("Print no of copies sold by RPA Course: " + CourseCopy);
				break;
			}
		}
		
		//Verify if Sum of all Course prices matches with Purchase Amount
		int sum = 0;
		for(int i=0; i<courseCount; i++) {
			int CoursePrice = jpath.getInt("courses["+i+"].price");
			int CourseCopy = jpath.getInt("courses["+i+"].copies");
			
			int amount = CoursePrice * CourseCopy;
			sum = sum + amount;
		}
		System.out.println("Sum of all Course prices with Course copy: "+ sum);

			int Amount = jpath.getInt("dashboard.purchaseAmount");	
			
			Assert.assertEquals(Amount, sum);
			
			if(Amount==sum)
			System.out.println("Purchase Amount is equal to the sum of the course price with course copies sold");
			else
				System.out.println("Purchase Amount is not equal to the sum of the course price with course copies sold");

	}

}
