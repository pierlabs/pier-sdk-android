package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoCampanhaUpdateValue;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{campanha_update_description}}}
 **/
@ApiModel(description = "{{{campanha_update_description}}}")
public class CampanhaUpdateValue  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idTipoCampanha")
  private Long idTipoCampanha = null;
  @SerializedName("planosCampanhas")
  private List<PlanoCampanhaUpdateValue> planosCampanhas = null;

  
  /**
   * {{{campanha_update_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{campanha_update_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{campanha_update_id_tipo_campanha_value}}}
   **/
  @ApiModelProperty(value = "{{{campanha_update_id_tipo_campanha_value}}}")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * {{{campanha_update_planos_campanhas_value}}}
   **/
  @ApiModelProperty(value = "{{{campanha_update_planos_campanhas_value}}}")
  public List<PlanoCampanhaUpdateValue> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaUpdateValue> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaUpdateValue {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idTipoCampanha: ").append(idTipoCampanha).append("\n");
    sb.append("  planosCampanhas: ").append(planosCampanhas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
