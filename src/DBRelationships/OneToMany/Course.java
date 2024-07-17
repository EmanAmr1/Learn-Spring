package DBRelationships.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import DBRelationships.OneToOne.Instructor;

//annotate the class as an entity and map to db table
@Entity
@Table(name="course")
public class Course {
	
	
	//define the fields
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name="id")
			private int id;
			
			@Column(name="title")
			private String title;
			
			@ManyToOne(cascade= {cascadeType.DETACH,cascadeType.MERGE
			                     ,cascadeType.PRISIST,cascadeType.REFRESH})
			
			@JoinColumn(name="instructor_id")
			private Instructor instructor;

			public Course() {

			}

			public Course(String title) {
				
				this.title = title;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Instructor getInstructor() {
				return instructor;
			}

			public void setInstructor(Instructor instructor) {
				this.instructor = instructor;
			}

			@Override
			public String toString() {
				return "Course [id=" + id + ", title=" + title +  "]";
			}

			
			
}
