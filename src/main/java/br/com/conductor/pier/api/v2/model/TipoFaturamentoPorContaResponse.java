package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Billing Object
 **/
@ApiModel(description = "Billing Object")
public class TipoFaturamentoPorContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraCancelamento")
  private String dataHoraCancelamento = null;
  @SerializedName("modificadoPor")
  private String modificadoPor = null;

  
  /**
   * Identification Code of the billing type per account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the billing type per account (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the related account to the billing type
   **/
  @ApiModelProperty(value = "Identification Code of the related account to the billing type")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status of the configuration that represents if the billing type per account is active or canceled
   **/
  @ApiModelProperty(value = "Status of the configuration that represents if the billing type per account is active or canceled")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Identification Code of the referenced billing type
   **/
  @ApiModelProperty(value = "Identification Code of the referenced billing type")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * Inclusion date of the configuration of the billing type per account
   **/
  @ApiModelProperty(value = "Inclusion date of the configuration of the billing type per account")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Cancellation date of the configuration type of billing per account
   **/
  @ApiModelProperty(value = "Cancellation date of the configuration type of billing per account")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Description of the responsable for the last update of the configuration
   **/
  @ApiModelProperty(value = "Description of the responsable for the last update of the configuration")
  public String getModificadoPor() {
    return modificadoPor;
  }
  public void setModificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraCancelamento: ").append(dataHoraCancelamento).append("\n");
    sb.append("  modificadoPor: ").append(modificadoPor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
