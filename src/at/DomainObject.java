package at;

public class DomainObject {

/**
 * Default constructor
 */

	public DomainObject() {
		super();
	}

public String uuid;

public DomainObject(String id) {
  super();
  this.id = id;
}

public String getUuid() {
   return id;
}

private String name;

public String id = UUID.randomUUID().toString()

}

private String comment;


public String getComment() {
   return comment;
}

public void setComment(String comment) {
   this.comment = comment;
}
