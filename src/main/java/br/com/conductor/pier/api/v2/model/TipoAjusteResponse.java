package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TipoTransacaoAjusteResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{tipo_ajuste_response_description}}}
 **/
@ApiModel(description = "{{{tipo_ajuste_response_description}}}")
public class TipoAjusteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("transacoes")
  private List<TipoTransacaoAjusteResponse> transacoes = null;

  
  /**
   * {{{tipo_ajuste_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_ajuste_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_ajuste_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_ajuste_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_ajuste_response_transacoes_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_ajuste_response_transacoes_value}}}")
  public List<TipoTransacaoAjusteResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TipoTransacaoAjusteResponse> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoAjusteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  transacoes: ").append(transacoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


