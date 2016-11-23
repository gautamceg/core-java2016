package org.fileProcessing;

public class JsonVo {
	private Group group;
	private String createdBY;
    private String memberWebId;

    public Group getGroup ()
    {
        return group;
    }

    public void setGroup (Group group)
    {
        this.group = group;
    }
    public String getCreatedBY ()
    {
        return createdBY;
    }

    public void setCreatedBY (String createdBY)
    {
        this.createdBY = createdBY;
    }

    public String getMemberWebId ()
    {
        return memberWebId;
    }

    public void setMemberWebId (String memberWebId)
    {
        this.memberWebId = memberWebId;
    }


    @Override
    public String toString()
    {
        return "{group : {"+group+"}, \n createdBY : "+createdBY+", \n memberWebId : "+memberWebId+"}";
    }
}