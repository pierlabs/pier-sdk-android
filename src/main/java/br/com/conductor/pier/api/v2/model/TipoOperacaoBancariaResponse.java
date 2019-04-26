package br.com.conductor.pier.api.v2.model;

import org.joda.time.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que representa um tipo de opera\u00E7\u00E3o banc\u00E1ria
 **/
@ApiModel(description = "Objeto que representa um tipo de opera\u00E7\u00E3o banc\u00E1ria")
public class TipoOperacaoBancariaResponse  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("horarioMaximo")
  private LocalTime horarioMaximo = null;
  @SerializedName("horarioMinimo")
  private LocalTime horarioMinimo = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTemplate")
  private Long idTipoTemplate = null;

  
  /**
   * Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o banc\u00E1ria")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Hor\u00E1rio m\u00E1ximo que pode ser realizada uma opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Hor\u00E1rio m\u00E1ximo que pode ser realizada uma opera\u00E7\u00E3o")
  public LocalTime getHorarioMaximo() {
    return horarioMaximo;
  }
  public void setHorarioMaximo(LocalTime horarioMaximo) {
    this.horarioMaximo = horarioMaximo;
  }

  
  /**
   * Hor\u00E1rio m\u00EDnimo que pode ser realizada uma opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Hor\u00E1rio m\u00EDnimo que pode ser realizada uma opera\u00E7\u00E3o")
  public LocalTime getHorarioMinimo() {
    return horarioMinimo;
  }
  public void setHorarioMinimo(LocalTime horarioMinimo) {
    this.horarioMinimo = horarioMinimo;
  }

  
  /**
   * C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do tipo do template
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo do template")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoBancariaResponse {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  horarioMaximo: ").append(horarioMaximo).append("\n");
    sb.append("  horarioMinimo: ").append(horarioMinimo).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTemplate: ").append(idTipoTemplate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
