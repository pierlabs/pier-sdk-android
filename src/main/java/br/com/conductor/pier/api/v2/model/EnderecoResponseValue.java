package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{endereco_response_description}}}
 **/
@ApiModel(description = "{{{endereco_response_description}}}")
public class EnderecoResponseValue  {
  
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
   * {{{endereco_response_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{endereco_response_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_endereco_value}}}")
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  
  /**
   * {{{endereco_response_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{endereco_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{endereco_response_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{endereco_response_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoResponseValue {\n");
    
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  endereco: ").append(endereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
