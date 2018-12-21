package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TipoTransacaoAjusteResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Type of adjustment
 **/
@ApiModel(description = "Type of adjustment")
public class TipoAjusteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagPagamentoLojista")
  private Boolean flagPagamentoLojista = null;
  @SerializedName("transacoes")
  private List<TipoTransacaoAjusteResponse> transacoes = null;

  
  /**
   * Identifier Code of the adjustment type
   **/
  @ApiModelProperty(value = "Identifier Code of the adjustment type")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the adjustment type
   **/
  @ApiModelProperty(value = "Description of the adjustment type")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identifies whether the payment was made in an establishment
   **/
  @ApiModelProperty(value = "Identifies whether the payment was made in an establishment")
  public Boolean getFlagPagamentoLojista() {
    return flagPagamentoLojista;
  }
  public void setFlagPagamentoLojista(Boolean flagPagamentoLojista) {
    this.flagPagamentoLojista = flagPagamentoLojista;
  }

  
  /**
   * Transactions by adjusts type
   **/
  @ApiModelProperty(value = "Transactions by adjusts type")
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
    sb.append("  flagPagamentoLojista: ").append(flagPagamentoLojista).append("\n");
    sb.append("  transacoes: ").append(transacoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
