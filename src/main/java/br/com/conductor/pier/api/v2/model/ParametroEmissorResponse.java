package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso Par\u00E2metro Emissor
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso Par\u00E2metro Emissor")
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
   * C\u00F3digo do par\u00E2metro
   **/
  @ApiModelProperty(value = "C\u00F3digo do par\u00E2metro")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Data da validade do par\u00E2metro
   **/
  @ApiModelProperty(value = "Data da validade do par\u00E2metro")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do par\u00E2metro")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Tipo do par\u00E2metro
   **/
  @ApiModelProperty(value = "Tipo do par\u00E2metro")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Valor do par\u00E2metro
   **/
  @ApiModelProperty(value = "Valor do par\u00E2metro")
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
