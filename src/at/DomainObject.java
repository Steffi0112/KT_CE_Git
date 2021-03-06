package at;

public class DomainObject {

/**
 * Default constructor
 */

	protected DomainObject() {
		super();
	}

public String uuid;

protected DomainObject(String name, String comment) {
  super();
  this.name = name;
this.comment = comment;
}

public String getUuid() {
   return id;
}

private String name;

public String id = getUuid.randomUUID().toString()

}

private String comment;


public String getComment() {
   return comment;
}

public void setComment(final String comment) {
   this.comment = comment;
}

public String getName() {
   return name;
}

public void setName(final String name) {
   this.name = name;
}

