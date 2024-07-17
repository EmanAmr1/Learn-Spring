package DBRelationships.OneToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import DBRelationships.OneToMany.Course;

//annotate the class as an entity and map to db table
@Entity
@Table(name="instructor")
public class Instructor {


	//define the fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first-name")
		private String firstName;
		
		@Column(name="last-name")
		private String lastName;

		@Column(name="email")
		private String email;
		
		@OneToOne(cascade=CascadeType.All)
		@JoinColumn(name="Instructor_detail_id")
		private InstructorDetail  InstructorDetail;
		
		
		
		@OneToMany(mappedBy="instructor",cascade= {cascadeType.DETACH,cascadeType.MERGE
                ,cascadeType.PRISIST,cascadeType.REFRESH})
		private List<Course> courses;
		
		
		
		
		
		
		
		public Instructor() {
			
		}
		
		public Instructor(String firstName, String lastName, String email) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}




		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public InstructorDetail getInstructorDetail() {
			return InstructorDetail;
		}

		public void setInstructorDetail(InstructorDetail instructorDetail) {
			InstructorDetail = instructorDetail;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<Course> getCourses() {
			return courses;
		}

		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}
	
	//add convenience methods for bi-directional relationship
		public void add(Course tempCourse) {
			if(courses == null) {
				courses =new ArrayList<>();
			}
			courses.add(tempCourse);
			tempCourse.setInstructor(this);
		}
	
}
