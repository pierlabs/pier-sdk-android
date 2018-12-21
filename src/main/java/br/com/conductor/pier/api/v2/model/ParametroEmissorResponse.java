package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Response for Emissary Parameter
 **/
@ApiModel(description = "Representation Object Response for Emissary Parameter")
public class ParametroEmissorResponse  {
  
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("tipo")
  private String tipo = null;
  @SerializedName("valorParametro")
  private String valorParametro = null;

  
  /**
   * CParameter code
   **/
  @ApiModelProperty(value = "CParameter code")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Parameter expiration date
   **/
  @ApiModelProperty(value = "Parameter expiration date")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Emissary Parameter Description
   **/
  @ApiModelProperty(value = "Emissary Parameter Description")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Parameter type
   **/
  @ApiModelProperty(value = "Parameter type")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Parameter value
   **/
  @ApiModelProperty(value = "Parameter value")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroEmissorResponse {\n");
    
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  tipo: ").append(tipo).append("\n");
    sb.append("  valorParametro: ").append(valorParametro).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
