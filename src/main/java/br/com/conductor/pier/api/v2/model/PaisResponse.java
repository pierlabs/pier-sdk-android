package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso pa\u00C3\u00ADses
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso pa\u00C3\u00ADses")
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
     AFRICA,  AMERICA_LATINA,  AMERICA_NORTE,  ASIA,  EUROPA,  OCEANIA, 
  };
  @SerializedName("continente")
  private ContinenteEnum continente = null;

  
  /**
   * C\u00C3\u00B3digo identificador \u00C3\u00BAnico do pa\u00C3\u00ADs na base
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador \u00C3\u00BAnico do pa\u00C3\u00ADs na base")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do pa\u00C3\u00ADs
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do pa\u00C3\u00ADs")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Sigla do pa\u00C3\u00ADs
   **/
  @ApiModelProperty(value = "Sigla do pa\u00C3\u00ADs")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  
  /**
   * Nome do pa\u00C3\u00ADs
   **/
  @ApiModelProperty(value = "Nome do pa\u00C3\u00ADs")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Continente no qual o pa\u00C3\u00ADs faz parte
   **/
  @ApiModelProperty(value = "Continente no qual o pa\u00C3\u00ADs faz parte")
  public ContinenteEnum getContinente() {
    return continente;
  }
  public void setContinente(ContinenteEnum continente) {
    this.continente = continente;
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
    sb.append("}\n");
    return sb.toString();
  }
}


