package br.com.conductor.caas.api.v1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ConsultarCartaoResponse  {
  
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("cvv2")
  private String cvv2 = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;
  @SerializedName("idCartao")
  private Integer idCartao = null;
  @SerializedName("idConta")
  private Integer idConta = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("numCartao")
  private String numCartao = null;
  @SerializedName("saldoDisponivel")
  private Double saldoDisponivel = null;
  @SerializedName("statusCartao")
  private Integer statusCartao = null;
  @SerializedName("statusConta")
  private Integer statusConta = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumCartao() {
    return numCartao;
  }
  public void setNumCartao(String numCartao) {
    this.numCartao = numCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoDisponivel() {
    return saldoDisponivel;
  }
  public void setSaldoDisponivel(Double saldoDisponivel) {
    this.saldoDisponivel = saldoDisponivel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(Integer statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Integer statusConta) {
    this.statusConta = statusConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarCartaoResponse {\n");
    
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  numCartao: ").append(numCartao).append("\n");
    sb.append("  saldoDisponivel: ").append(saldoDisponivel).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


