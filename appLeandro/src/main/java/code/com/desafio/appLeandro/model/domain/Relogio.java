package code.com.desafio.appLeandro.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name = "TbRelogio")
public class Relogio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private int anoFabricacao;
	private float preco;
	private String codProduto;
	private boolean registeAgua;
	
	public Relogio() {
		this.preco = 999;
		this.codProduto = "BR";
		this.registeAgua = true;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Relogio(String marca, int anoFabricacao) {
		this();//chama o construtor que nao tem parametro
		this.marca= marca;
		this.anoFabricacao =  anoFabricacao;
	}
	
	@Override
	public String toString() {
		
		return "SmartWatch  " +marca+" foi construido em " + anoFabricacao;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public boolean isRegisteAgua() {
		return registeAgua;
	}
	public void setRegisteAgua(boolean registeAgua) {
		this.registeAgua = registeAgua;
	}
	
}
