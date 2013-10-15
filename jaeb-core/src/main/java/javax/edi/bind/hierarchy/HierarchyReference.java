package javax.edi.bind.hierarchy;

public class HierarchyReference {

	private final String parentId;
	private final String id;
	
	public HierarchyReference(String id, String parentId) {
		this.id = id;
		this.parentId = parentId;
	}
	
	public String getId() {
		return id;
	}
	
	public String getParentId() {
		return parentId;
	}
	
	
	
	@Override
	public String toString() {
		return "HierarchyReference [parentId=" + parentId + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HierarchyReference other = (HierarchyReference) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parentId == null) {
			if (other.parentId != null)
				return false;
		} else if (!parentId.equals(other.parentId))
			return false;
		return true;
	}
	
	
	
}
