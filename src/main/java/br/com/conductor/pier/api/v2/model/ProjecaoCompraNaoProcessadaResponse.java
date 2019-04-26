package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do response da proje\u00E7\u00E3o de compras n\u00E3o processadas
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do response da proje\u00E7\u00E3o de compras n\u00E3o processadas")
public class ProjecaoCompraNaoProcessadaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataVencimentoFatura")
  private String dataVencimentoFatura = null;
  @SerializedName("valorTotal")
  private BigDecimal valorTotal = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("dataCorte")
  private String dataCorte = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data de vencimento padr\u00E3o da proje\u00E7\u00E3o em formato AAAA-MM-DD
   **/
  @ApiModelProperty(value = "Data de vencimento padr\u00E3o da proje\u00E7\u00E3o em formato AAAA-MM-DD")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Valor total da proje\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor total da proje\u00E7\u00E3o")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Data de vencimento real da proje\u00E7\u00E3o em formato AAAA-MM-DD
   **/
  @ApiModelProperty(value = "Data de vencimento real da proje\u00E7\u00E3o em formato AAAA-MM-DD")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de corte da proje\u00E7\u00E3o em formato AAAA-MM-DD
   **/
  @ApiModelProperty(value = "Data de corte da proje\u00E7\u00E3o em formato AAAA-MM-DD")
  public String getDataCorte() {
    return dataCorte;
  }
  public void setDataCorte(String dataCorte) {
    this.dataCorte = dataCorte;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjecaoCompraNaoProcessadaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataCorte: ").append(dataCorte).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
