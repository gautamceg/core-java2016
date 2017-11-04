package fileProcessing;

public class Group {

	private String groupName;

    private String groupCode;

    public String getGroupName ()
    {
        return groupName;
    }

    public void setGroupName (String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupCode ()
    {
        return groupCode;
    }

    public void setGroupCode (String groupCode)
    {
        this.groupCode = groupCode;
    }

    @Override
    public String toString()
    {
        return "\n groupName : "+groupName+",\n groupCode : "+groupCode;
    }
}
