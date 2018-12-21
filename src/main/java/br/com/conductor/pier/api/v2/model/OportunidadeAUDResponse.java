package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.CdtDetalheOportunidadeAUD;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the Opportunity resource
 **/
@ApiModel(description = "Response Representation of the Opportunity resource")
public class OportunidadeAUDResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("idStatusOportunidade")
  private Long idStatusOportunidade = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataAtualizacao")
  private String dataAtualizacao = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataInicioVigencia")
  private String dataInicioVigencia = null;
  @SerializedName("dataFimVigencia")
  private String dataFimVigencia = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("detalhes")
  private List<CdtDetalheOportunidadeAUD> detalhes = null;
  @SerializedName("revDate")
  private String revDate = null;
  @SerializedName("revType")
  private Long revType = null;
  @SerializedName("rev")
  private Long rev = null;

  
  /**
   * Identifier Code of the Opportunity
   **/
  @ApiModelProperty(value = "Identifier Code of the Opportunity")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the opportunity type
   **/
  @ApiModelProperty(value = "Identifier Code of the opportunity type")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * Identifier Code of the opportunity status
   **/
  @ApiModelProperty(value = "Identifier Code of the opportunity status")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * Register date of the opportunity
   **/
  @ApiModelProperty(value = "Register date of the opportunity")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Update date of the opportunity
   **/
  @ApiModelProperty(value = "Update date of the opportunity")
  public String getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  
  /**
   * IRs Number of the client which it will be offered the opportunity
   **/
  @ApiModelProperty(value = "IRs Number of the client which it will be offered the opportunity")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Beginning of the opportunity duration
   **/
  @ApiModelProperty(value = "Beginning of the opportunity duration")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * Ending of the Duration of opportunity
   **/
  @ApiModelProperty(value = "Ending of the Duration of opportunity")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * Flag of the verification if the opportunity is active
   **/
  @ApiModelProperty(value = "Flag of the verification if the opportunity is active")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * List of details of the opportunity
   **/
  @ApiModelProperty(value = "List of details of the opportunity")
  public List<CdtDetalheOportunidadeAUD> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<CdtDetalheOportunidadeAUD> detalhes) {
    this.detalhes = detalhes;
  }

  
  /**
   * Auditorail Date
   **/
  @ApiModelProperty(value = "Auditorail Date")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * Type of the auditorial
   **/
  @ApiModelProperty(value = "Type of the auditorial")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * Auditorial Identifier
   **/
  @ApiModelProperty(value = "Auditorial Identifier")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeAUDResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  idStatusOportunidade: ").append(idStatusOportunidade).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataAtualizacao: ").append(dataAtualizacao).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataInicioVigencia: ").append(dataInicioVigencia).append("\n");
    sb.append("  dataFimVigencia: ").append(dataFimVigencia).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("  revDate: ").append(revDate).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
