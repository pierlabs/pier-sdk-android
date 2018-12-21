package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoCampanhaPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Campaign
 **/
@ApiModel(description = "Campaign")
public class CampanhaPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idTipoCampanha")
  private Long idTipoCampanha = null;
  @SerializedName("planosCampanhas")
  private List<PlanoCampanhaPersist> planosCampanhas = null;

  
  /**
   * Name of the campaign
   **/
  @ApiModelProperty(value = "Name of the campaign")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identification Code of the Campaign type
   **/
  @ApiModelProperty(value = "Identification Code of the Campaign type")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * List with the plans of the campaign
   **/
  @ApiModelProperty(value = "List with the plans of the campaign")
  public List<PlanoCampanhaPersist> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaPersist> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idTipoCampanha: ").append(idTipoCampanha).append("\n");
    sb.append("  planosCampanhas: ").append(planosCampanhas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
