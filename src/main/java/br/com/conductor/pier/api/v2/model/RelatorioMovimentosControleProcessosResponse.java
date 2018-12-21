package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of response fields from a process control list
 **/
@ApiModel(description = "Representation of response fields from a process control list")
public class RelatorioMovimentosControleProcessosResponse  {
  
  @SerializedName("vencimento")
  private String vencimento = null;
  @SerializedName("dtCorteMov")
  private String dtCorteMov = null;
  @SerializedName("dtCorteReal")
  private String dtCorteReal = null;
  @SerializedName("dtFatMov")
  private String dtFatMov = null;
  @SerializedName("dtFatReal")
  private String dtFatReal = null;
  @SerializedName("proximoVencimentoReal")
  private String proximoVencimentoReal = null;
  @SerializedName("prazoEntradaFatVec")
  private Integer prazoEntradaFatVec = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDtCorteMov() {
    return dtCorteMov;
  }
  public void setDtCorteMov(String dtCorteMov) {
    this.dtCorteMov = dtCorteMov;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDtCorteReal() {
    return dtCorteReal;
  }
  public void setDtCorteReal(String dtCorteReal) {
    this.dtCorteReal = dtCorteReal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDtFatMov() {
    return dtFatMov;
  }
  public void setDtFatMov(String dtFatMov) {
    this.dtFatMov = dtFatMov;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDtFatReal() {
    return dtFatReal;
  }
  public void setDtFatReal(String dtFatReal) {
    this.dtFatReal = dtFatReal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getProximoVencimentoReal() {
    return proximoVencimentoReal;
  }
  public void setProximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPrazoEntradaFatVec() {
    return prazoEntradaFatVec;
  }
  public void setPrazoEntradaFatVec(Integer prazoEntradaFatVec) {
    this.prazoEntradaFatVec = prazoEntradaFatVec;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatorioMovimentosControleProcessosResponse {\n");
    
    sb.append("  vencimento: ").append(vencimento).append("\n");
    sb.append("  dtCorteMov: ").append(dtCorteMov).append("\n");
    sb.append("  dtCorteReal: ").append(dtCorteReal).append("\n");
    sb.append("  dtFatMov: ").append(dtFatMov).append("\n");
    sb.append("  dtFatReal: ").append(dtFatReal).append("\n");
    sb.append("  proximoVencimentoReal: ").append(proximoVencimentoReal).append("\n");
    sb.append("  prazoEntradaFatVec: ").append(prazoEntradaFatVec).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
