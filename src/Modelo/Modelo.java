public class Modelo {
	private int id, i = 0;
	private String desc, nome;
	
	public Modelo(String n, String d){
		this.nome = n;
		this.desc = d;
		id=i;
		i++;	
	}
	
	public int getId(){
		return id;		
	}
	public String getDesc(){
		return desc;		
	}
	public String getNome(){
		return nome;		
	}
	
	public void setNome(String n){
		nome = n;		
	}
	
	public void setDesc(String d){
		nome = d;		
	}

}
