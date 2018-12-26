package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso pa\u00EDses
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso pa\u00EDses")
public class PaisResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("sigla")
  private String sigla = null;
  @SerializedName("descricao")
  private String descricao = null;
  public enum ContinenteEnum {
     AFRICA,  AMERICA_LATINA,  AMERICA_NORTE,  ASIA,  ANTARTIDA,  EUROPA,  OCEANIA, 
  };
  @SerializedName("continente")
  private ContinenteEnum continente = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo identificador \u00FAnico do pa\u00EDs na base
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador \u00FAnico do pa\u00EDs na base")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do pa\u00EDs
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do pa\u00EDs")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Sigla do pa\u00EDs
   **/
  @ApiModelProperty(value = "Sigla do pa\u00EDs")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  
  /**
   * Nome do pa\u00EDs
   **/
  @ApiModelProperty(value = "Nome do pa\u00EDs")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Continente no qual o pa\u00EDs faz parte
   **/
  @ApiModelProperty(value = "Continente no qual o pa\u00EDs faz parte")
  public ContinenteEnum getContinente() {
    return continente;
  }
  public void setContinente(ContinenteEnum continente) {
    this.continente = continente;
  }

  
  /**
   * Atributo que representa se o pa\u00EDs est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Atributo que representa se o pa\u00EDs est\u00E1 ativo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaisResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  sigla: ").append(sigla).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  continente: ").append(continente).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
