package DBRelationships;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//annotate the class as an entity and map to db table
@Entity
@Table(name="instructor_detail ")
public class InstructorDetail {


//define the fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	@Column(name="hoppy")
	private String hoppy;

	
	
	public InstructorDetail() {
	
	}

	public InstructorDetail( String youtubeChannel, String hoppy) {
		this.youtubeChannel = youtubeChannel;
		this.hoppy = hoppy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHoppy() {
		return hoppy;
	}

	public void setHoppy(String hoppy) {
		this.hoppy = hoppy;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hoppy=" + hoppy + "]";
	}
	
	
	
}