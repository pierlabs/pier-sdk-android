package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoCampanhaUpdate;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Campanha
 **/
@ApiModel(description = "Objeto Campanha")
public class CampanhaUpdate  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idTipoCampanha")
  private Long idTipoCampanha = null;
  @SerializedName("planosCampanhas")
  private List<PlanoCampanhaUpdate> planosCampanhas = null;

  
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo da campanha.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo da campanha.")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * Lista com os planos de campanha
   **/
  @ApiModelProperty(value = "Lista com os planos de campanha")
  public List<PlanoCampanhaUpdate> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaUpdate> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idTipoCampanha: ").append(idTipoCampanha).append("\n");
    sb.append("  planosCampanhas: ").append(planosCampanhas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


