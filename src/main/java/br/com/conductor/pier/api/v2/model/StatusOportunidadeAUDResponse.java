package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso StatusTipoOportunidadeAUD
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso StatusTipoOportunidadeAUD")
public class StatusOportunidadeAUDResponse  {
  
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revType")
  private Long revType = null;
  @SerializedName("revDate")
  private Date revDate = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * C\u00C3\u00B3digo identificador da auditoria dos tipos oportunidades
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da auditoria dos tipos oportunidades")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * C\u00C3\u00B3digo que representa o tipo de a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo que representa o tipo de a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * Data da a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades
   **/
  @ApiModelProperty(value = "Data da a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades")
  public Date getRevDate() {
    return revDate;
  }
  public void setRevDate(Date revDate) {
    this.revDate = revDate;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do StatusOportunidade
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do StatusOportunidade")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do TipoOportunidade
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do TipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * Nome do status oportunidade
   **/
  @ApiModelProperty(value = "Nome do status oportunidade")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descricao do StatusOportunidade
   **/
  @ApiModelProperty(value = "Descricao do StatusOportunidade")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa se o tipo oportunidade est\u00C3\u00A1 ativo
   **/
  @ApiModelProperty(value = "Flag que representa se o tipo oportunidade est\u00C3\u00A1 ativo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadeAUDResponse {\n");
    
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  revDate: ").append(revDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


