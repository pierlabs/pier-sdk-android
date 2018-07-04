package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{pais_response_description}}}
 **/
@ApiModel(description = "{{{pais_response_description}}}")
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
   * {{{pais_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{pais_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pais_response_codigo_value}}}
   **/
  @ApiModelProperty(value = "{{{pais_response_codigo_value}}}")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{pais_response_sigla_value}}}
   **/
  @ApiModelProperty(value = "{{{pais_response_sigla_value}}}")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  
  /**
   * {{{pais_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{pais_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{pais_response_continente_value}}}
   **/
  @ApiModelProperty(value = "{{{pais_response_continente_value}}}")
  public ContinenteEnum getContinente() {
    return continente;
  }
  public void setContinente(ContinenteEnum continente) {
    this.continente = continente;
  }

  
  /**
   * {{{pais_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{pais_response_flag_ativo_value}}}")
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


