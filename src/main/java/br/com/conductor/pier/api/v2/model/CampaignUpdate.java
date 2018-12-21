package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanCampaignUpdate;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Campaign
 **/
@ApiModel(description = "Object Campaign")
public class CampaignUpdate  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idTipoCampanha")
  private Long idTipoCampanha = null;
  @SerializedName("planosCampanhas")
  private List<PlanCampaignUpdate> planosCampanhas = null;

  
  /**
   * Campaign name
   **/
  @ApiModelProperty(value = "Campaign name")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identification Code of the campaign type
   **/
  @ApiModelProperty(value = "Identification Code of the campaign type")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * List with the plans of campaign
   **/
  @ApiModelProperty(value = "List with the plans of campaign")
  public List<PlanCampaignUpdate> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanCampaignUpdate> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idTipoCampanha: ").append(idTipoCampanha).append("\n");
    sb.append("  planosCampanhas: ").append(planosCampanhas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
