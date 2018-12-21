package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the country resource
 **/
@ApiModel(description = "Response Representation of the country resource")
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
   * Unique Identifier Code of the country in the base
   **/
  @ApiModelProperty(value = "Unique Identifier Code of the country in the base")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the Country
   **/
  @ApiModelProperty(value = "Identifier Code of the Country")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Country Acronym
   **/
  @ApiModelProperty(value = "Country Acronym")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  
  /**
   * Country Name
   **/
  @ApiModelProperty(value = "Country Name")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Continent which the country takes part
   **/
  @ApiModelProperty(value = "Continent which the country takes part")
  public ContinenteEnum getContinente() {
    return continente;
  }
  public void setContinente(ContinenteEnum continente) {
    this.continente = continente;
  }

  
  /**
   * Attribute that represents if the country is active
   **/
  @ApiModelProperty(value = "Attribute that represents if the country is active")
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
