package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoCampanhaResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{campanha_response_description}}}
 **/
@ApiModel(description = "{{{campanha_response_description}}}")
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
   * {{{campanha_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{campanha_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{campanha_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{campanha_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{campanha_response_id_tipo_campanha_value}}}
   **/
  @ApiModelProperty(value = "{{{campanha_response_id_tipo_campanha_value}}}")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * {{{campanha_response_planos_campanhas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{campanha_response_planos_campanhas_value}}}")
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


