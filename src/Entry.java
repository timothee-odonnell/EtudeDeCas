
public class Entry 
{
	private String Id;
	private String name;
	private String type;
	private String reaction;
	private String link;
	
	public Entry (String Id, String name,String type,String reaction,String link)
	{
		this.Id= Id;
		this.name= name;
		this.reaction= reaction;
		this.type= type;
		this.link= link;
	}
	
	void PrintEntry()
	{
		System.out.print("identifiant: "+Id+"\n nom: "+name+"\n reaction: "+reaction+"\n type: "+type+"\n lien: "+link);
	}

}
