package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transacao_pay_query_response_description}}}
 **/
@ApiModel(description = "{{{transacao_pay_query_response_description}}}")
public class TransacaoPayQueryResponse  {
  
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * {{{transacao_pay_query_response_codigo_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_query_response_codigo_value}}}")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{transacao_pay_query_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_query_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPayQueryResponse {\n");
    
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


