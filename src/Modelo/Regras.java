package entidade;

import java.util.ArrayList;
import java.util.Arrays;

public class Regras extends Regra {
	private ArrayList <Regra> regras;
	
	public Regras(){
		regras = new ArrayList<Regra>();
	}
	
	public void setRegra(Regra r){
		regras.add(r);
	}
	
	public void ImprimeRegras(){
		System.out.println(Arrays.toString(regras.toArray()));
	}
	
	public void setRegra(Regra r, int n){
		regras.add(n, r);
	}
	
	public Regra getRegra(int n){
		regras.get(n);
	}
	
	public void removeRegra(Regra r){
		regras.remove(r);
	}
	public void limparRegra(){
		regras.clear();
	}
	public void numRegra(){
		regras.size();
	}
}
