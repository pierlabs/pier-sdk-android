package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Address
 **/
@ApiModel(description = "Object Address")
public class EnderecoNacionalResponse  {
  
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("endereco")
  private String endereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("uf")
  private String uf = null;

  
  /**
   * Show the Zipcode in format '58800000'
   **/
  @ApiModelProperty(value = "Show the Zipcode in format '58800000'")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * address
   **/
  @ApiModelProperty(value = "address")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   * Show the name of the neighborhood
   **/
  @ApiModelProperty(value = "Show the name of the neighborhood")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Show the name of the city
   **/
  @ApiModelProperty(value = "Show the name of the city")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Show the acronym of the Federal Unity
   **/
  @ApiModelProperty(value = "Show the acronym of the Federal Unity")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoNacionalResponse {\n");
    
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  endereco: ").append(endereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
