package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.CdtDetalheOportunidadeAUD;
import java.util.*;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Oportunidades
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Oportunidades")
public class OportunidadeAUDResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("idStatusOportunidade")
  private Long idStatusOportunidade = null;
  @SerializedName("dataCadastro")
  private Date dataCadastro = null;
  @SerializedName("dataAtualizacao")
  private Date dataAtualizacao = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataInicioVigencia")
  private Date dataInicioVigencia = null;
  @SerializedName("dataFimVigencia")
  private Date dataFimVigencia = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("detalhes")
  private List<CdtDetalheOportunidadeAUD> detalhes = null;
  @SerializedName("revDate")
  private Date revDate = null;
  @SerializedName("revType")
  private Long revType = null;

  
  /**
   * C\u00C3\u00B3digo identificador da oportunidade
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da oportunidade")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo oportunidade
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do tipo oportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do status oportunidade
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do status oportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * Data cadastro da oportunidade.
   **/
  @ApiModelProperty(value = "Data cadastro da oportunidade.")
  public Date getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Data atualiza\u00C3\u00A7\u00C3\u00A3o da oportunidade.
   **/
  @ApiModelProperty(value = "Data atualiza\u00C3\u00A7\u00C3\u00A3o da oportunidade.")
  public Date getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(Date dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  
  /**
   * N\u00C3\u00BAmero receita federal do cliente ao qual ser\u00C3\u00A1 ofertada a oportunidade
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero receita federal do cliente ao qual ser\u00C3\u00A1 ofertada a oportunidade")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * In\u00C3\u00ADcio da vig\u00C3\u00AAncia da oportunidade
   **/
  @ApiModelProperty(value = "In\u00C3\u00ADcio da vig\u00C3\u00AAncia da oportunidade")
  public Date getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(Date dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * fim da vig\u00C3\u00AAncia da oportunidade
   **/
  @ApiModelProperty(value = "fim da vig\u00C3\u00AAncia da oportunidade")
  public Date getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(Date dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * Flag de verifica\u00C3\u00A7\u00C3\u00A3o se a oportunidade est\u00C3\u00A1 ativa
   **/
  @ApiModelProperty(value = "Flag de verifica\u00C3\u00A7\u00C3\u00A3o se a oportunidade est\u00C3\u00A1 ativa")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Lista de detalhes da oportunidade
   **/
  @ApiModelProperty(value = "Lista de detalhes da oportunidade")
  public List<CdtDetalheOportunidadeAUD> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<CdtDetalheOportunidadeAUD> detalhes) {
    this.detalhes = detalhes;
  }

  
  /**
   * Data da auditoria
   **/
  @ApiModelProperty(value = "Data da auditoria")
  public Date getRevDate() {
    return revDate;
  }
  public void setRevDate(Date revDate) {
    this.revDate = revDate;
  }

  
  /**
   * Tipo da auditoria
   **/
  @ApiModelProperty(value = "Tipo da auditoria")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
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
    sb.append("}\n");
    return sb.toString();
  }
}


