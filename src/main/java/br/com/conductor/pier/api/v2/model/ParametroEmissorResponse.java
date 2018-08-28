package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{parametro_emissor_resposta_descricao}}}
 **/
@ApiModel(description = "{{{parametro_emissor_resposta_descricao}}}")
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
   * {{{parametro_emissor_resposta_codigo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{parametro_emissor_resposta_codigo_descricao}}}")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{parametro_emissor_resposta_data_validade_descricao}}}
   **/
  @ApiModelProperty(value = "{{{parametro_emissor_resposta_data_validade_descricao}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{parametro_emissor_resposta_descricao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{parametro_emissor_resposta_descricao_descricao}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{parametro_emissor_resposta_tipo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{parametro_emissor_resposta_tipo_descricao}}}")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * {{{parametro_emissor_resposta_valor_parametro_descricao}}}
   **/
  @ApiModelProperty(value = "{{{parametro_emissor_resposta_valor_parametro_descricao}}}")
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
