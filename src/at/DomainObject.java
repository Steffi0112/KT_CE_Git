package at;

public class DomainObject {

/**
 * Default constructor
 */

	public DomainObject() {
		super();
	}

public String uuid;

public DomainObject(String name, String comment) {
  super();
  this.name = name;
this.comment = comment;
}

public String getUuid() {
   return id;
}

private String name;

public String id = UUID.randomUUID().toString()

}
