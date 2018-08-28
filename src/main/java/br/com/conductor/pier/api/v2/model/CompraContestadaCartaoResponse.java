package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{compra_contestada_cartao_response_description}}}
 **/
@ApiModel(description = "{{{compra_contestada_cartao_response_description}}}")
public class CompraContestadaCartaoResponse  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("agingCompras")
  private Long agingCompras = null;
  @SerializedName("agingContestacao")
  private Long agingContestacao = null;
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("bandeira")
  private String bandeira = null;
  @SerializedName("valorCompra")
  private String valorCompra = null;

  
  /**
   * {{{compra_contestada_cartao_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{compra_contestada_cartao_response_aging_compras_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_aging_compras_value}}}")
  public Long getAgingCompras() {
    return agingCompras;
  }
  public void setAgingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
  }

  
  /**
   * {{{compra_contestada_cartao_response_aging_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_aging_contestacao_value}}}")
  public Long getAgingContestacao() {
    return agingContestacao;
  }
  public void setAgingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
  }

  
  /**
   * {{{compra_contestada_cartao_response_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_cartao_value}}}")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * {{{compra_contestada_cartao_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{compra_contestada_cartao_response_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_bandeira_value}}}")
  public String getBandeira() {
    return bandeira;
  }
  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  
  /**
   * {{{compra_contestada_cartao_response_valor_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_response_valor_compra_value}}}")
  public String getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(String valorCompra) {
    this.valorCompra = valorCompra;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaCartaoResponse {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  agingCompras: ").append(agingCompras).append("\n");
    sb.append("  agingContestacao: ").append(agingContestacao).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  bandeira: ").append(bandeira).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
