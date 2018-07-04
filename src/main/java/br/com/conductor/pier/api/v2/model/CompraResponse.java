package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{compra_response_description}}}
 **/
@ApiModel(description = "{{{compra_response_description}}}")
public class CompraResponse  {
  
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("idCompra")
  private Long idCompra = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("valorTotalCompra")
  private BigDecimal valorTotalCompra = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("primeiraParcela")
  private BigDecimal primeiraParcela = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("numeroParcelasAntecipaveis")
  private Integer numeroParcelasAntecipaveis = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("tipoOrigemTransacao")
  private String tipoOrigemTransacao = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("nomePortadorCartao")
  private String nomePortadorCartao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{compra_response_id_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_id_compra_value}}}")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * {{{compra_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{compra_response_data_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_data_compra_value}}}")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * {{{compra_response_valor_total_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_valor_total_compra_value}}}")
  public BigDecimal getValorTotalCompra() {
    return valorTotalCompra;
  }
  public void setValorTotalCompra(BigDecimal valorTotalCompra) {
    this.valorTotalCompra = valorTotalCompra;
  }

  
  /**
   * {{{compra_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{compra_response_primeira_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_primeira_parcela_value}}}")
  public BigDecimal getPrimeiraParcela() {
    return primeiraParcela;
  }
  public void setPrimeiraParcela(BigDecimal primeiraParcela) {
    this.primeiraParcela = primeiraParcela;
  }

  
  /**
   * {{{compra_response_numero_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{compra_response_numero_parcelas_antecipaveis_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_numero_parcelas_antecipaveis_value}}}")
  public Integer getNumeroParcelasAntecipaveis() {
    return numeroParcelasAntecipaveis;
  }
  public void setNumeroParcelasAntecipaveis(Integer numeroParcelasAntecipaveis) {
    this.numeroParcelasAntecipaveis = numeroParcelasAntecipaveis;
  }

  
  /**
   * {{{compra_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{compra_response_tipo_origem_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_tipo_origem_transacao_value}}}")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * {{{compra_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{compra_response_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_pais_value}}}")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{compra_response_latitude_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_latitude_value}}}")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * {{{compra_response_longitude_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_longitude_value}}}")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * {{{compra_response_id_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_id_grupo_m_c_c_value}}}")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * {{{compra_response_descricao_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_descricao_grupo_m_c_c_value}}}")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * {{{compra_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{compra_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{compra_response_descricao_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_descricao_produto_value}}}")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * {{{compra_response_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_cartao_value}}}")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * {{{compra_response_nome_portador_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_response_nome_portador_cartao_value}}}")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraResponse {\n");
    
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  idCompra: ").append(idCompra).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  valorTotalCompra: ").append(valorTotalCompra).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  primeiraParcela: ").append(primeiraParcela).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  numeroParcelasAntecipaveis: ").append(numeroParcelasAntecipaveis).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  tipoOrigemTransacao: ").append(tipoOrigemTransacao).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  descricaoProduto: ").append(descricaoProduto).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  nomePortadorCartao: ").append(nomePortadorCartao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


