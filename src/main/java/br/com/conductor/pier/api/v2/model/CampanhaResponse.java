package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoCampanhaResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de campanha
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de campanha")
public class CampanhaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idTipoCampanha")
  private Long idTipoCampanha = null;
  @SerializedName("planosCampanhas")
  private List<PlanoCampanhaResponse> planosCampanhas = null;

  
  /**
   * Identificador da campanha
   **/
  @ApiModelProperty(value = "Identificador da campanha")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome da campanha
   **/
  @ApiModelProperty(value = "Nome da campanha")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo de campanha a qual a a Campanha pertence
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo de campanha a qual a a Campanha pertence")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * Lista de planos associados a Campanha
   **/
  @ApiModelProperty(required = true, value = "Lista de planos associados a Campanha")
  public List<PlanoCampanhaResponse> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaResponse> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idTipoCampanha: ").append(idTipoCampanha).append("\n");
    sb.append("  planosCampanhas: ").append(planosCampanhas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


