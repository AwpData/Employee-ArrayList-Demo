public class Buisness{ 
    private String id; 
    private String name; 
    private String DOB; 
    private String SkillSetName; 
    private String ProjectName; 
     
    public Buisness(String id, String name, String DOB, String SkillSetName, String ProjectName) { 
        this.id = id; 
        this.name = name; 
        this.DOB = DOB; 
        this.SkillSetName = SkillSetName; 
        this.ProjectName = ProjectName; 
    } 
     
     
    public String toString() { //test method
        return id + " " + name + " " + DOB + " " + SkillSetName + " " + ProjectName; 
    } 
} 
 
