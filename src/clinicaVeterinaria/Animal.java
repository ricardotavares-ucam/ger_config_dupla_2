package clinicaVeterinaria;

public class Animal 
{

	private String nome_animal;
	private int idade_animal;
	private int sexo_animal;
	
	
	public String getNome_animal() 
	{
		return nome_animal;
	}
	
	public void setNome_animal(String nome_animal) 
	{
		this.nome_animal = nome_animal;
	}
	
	public int getIdade_animal() 
	{
		return idade_animal;
	}
	
	public void setIdade_animal(int idade_animal) 
	{
		this.idade_animal = idade_animal;
	}
	
	public int getSexo_animal()
	{
		return sexo_animal;
	}
	
	public void setSexo_animal(int sexo_animal) 
	{
		this.sexo_animal = sexo_animal;
	}
	
	
	public String vis_Animal()
	{
		return "";
	}
	
	public String con_Animal()
	{
		return "";
	}
	
}
