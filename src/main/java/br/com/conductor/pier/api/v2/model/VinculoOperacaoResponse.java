package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjetoVinculoOperacao
 **/
@ApiModel(description = "ObjetoVinculoOperacao")
public class VinculoOperacaoResponse  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("codigoMCC")
  private Integer codigoMCC = null;
  @SerializedName("nomeOperacao")
  private String nomeOperacao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Opera\u00E7\u00E3o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Opera\u00E7\u00E3o (id)")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00F3digo de processamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de processamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * C\u00F3digo MCC
   **/
  @ApiModelProperty(value = "C\u00F3digo MCC")
  public Integer getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Integer codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * Nome da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Nome da opera\u00E7\u00E3o")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoOperacaoResponse {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("  nomeOperacao: ").append(nomeOperacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
