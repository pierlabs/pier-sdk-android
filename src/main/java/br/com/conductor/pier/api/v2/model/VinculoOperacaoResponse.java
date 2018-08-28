package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{vinculo_operacao_response_description}}}
 **/
@ApiModel(description = "{{{vinculo_operacao_response_description}}}")
public class VinculoOperacaoResponse  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("codigoMCC")
  private Integer codigoMCC = null;

  
  /**
   * {{{vinculo_operacao_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_operacao_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{vinculo_operacao_response_id_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_operacao_response_id_operacao_value}}}")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{vinculo_operacao_response_codigo_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_operacao_response_codigo_processamento_value}}}")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{vinculo_operacao_response_codigo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{vinculo_operacao_response_codigo_m_c_c_value}}}")
  public Integer getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Integer codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoOperacaoResponse {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
