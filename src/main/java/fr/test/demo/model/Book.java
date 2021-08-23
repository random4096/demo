package fr.test.demo.model;

public class Book {
    //@Id
    private String id;
    private boolean read;
    private boolean owned;
    private String savedDate;
    private String lendPersonName;
    private String lendDate;
    //private OLDataBook data;
    
    public Book() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getRead() {
        return this.read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean getOwned() {
        return this.owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

	public String getSavedDate() {
		return this.savedDate;
	}
	
	public void setSavedDate(String savedDate) {
		this.savedDate = savedDate; 
	}
/*
	public OLDataBook getData() {
		return this.data;
	}
	
	public void setData(OLDataBook data) {
		this.data = data; 
	}*/

	public String getLendPersonName() {
		return this.lendPersonName;
	}
	
	public void setLendPersonName(String lendPersonName) {
		this.lendPersonName = lendPersonName; 
	}

	public String getLendDate() {
		return this.lendDate;
	}
	
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate; 
	}


    @Override
    public String toString() {
        String str = "id:" + this.id + "read: " + this.read + " owned: " 
        + this.owned + " savedDate: " + this.savedDate;
        //+ "\n" + this.data != null ? this.data.toString() : "No data.";
        return str;
    }
}