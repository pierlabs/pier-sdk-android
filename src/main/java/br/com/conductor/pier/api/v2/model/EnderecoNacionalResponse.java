package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Endere\u00E7o
 **/
@ApiModel(description = "Objeto Endere\u00E7o")
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
   * Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Endere\u00E7o
   **/
  @ApiModelProperty(value = "Endere\u00E7o")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   * Apresenta nome do bairro
   **/
  @ApiModelProperty(value = "Apresenta nome do bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Apresenta nome da cidade
   **/
  @ApiModelProperty(value = "Apresenta nome da cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Apresenta sigla da Unidade Federativa
   **/
  @ApiModelProperty(value = "Apresenta sigla da Unidade Federativa")
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
