package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Compra
 **/
@ApiModel(description = "Objeto de Compra")
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
  @SerializedName("tipoEvento")
  private String tipoEvento = null;

  
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
   * C\u00F3digo de identifica\u00E7\u00E3o da compra
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da compra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da autoriza\u00E7\u00E3o da compra
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status da autoriza\u00E7\u00E3o da compra")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data da compra
   **/
  @ApiModelProperty(value = "Data da compra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Valor total da compra
   **/
  @ApiModelProperty(value = "Valor total da compra")
  public BigDecimal getValorTotalCompra() {
    return valorTotalCompra;
  }
  public void setValorTotalCompra(BigDecimal valorTotalCompra) {
    this.valorTotalCompra = valorTotalCompra;
  }

  
  /**
   * Valor da parcela da compra
   **/
  @ApiModelProperty(value = "Valor da parcela da compra")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor da primeira parcela da compra
   **/
  @ApiModelProperty(value = "Valor da primeira parcela da compra")
  public BigDecimal getPrimeiraParcela() {
    return primeiraParcela;
  }
  public void setPrimeiraParcela(BigDecimal primeiraParcela) {
    this.primeiraParcela = primeiraParcela;
  }

  
  /**
   * N\u00FAmero de parcelas da compra
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas da compra")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * N\u00FAmero de parcelas antecip\u00E1veis da compra
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas antecip\u00E1veis da compra")
  public Integer getNumeroParcelasAntecipaveis() {
    return numeroParcelasAntecipaveis;
  }
  public void setNumeroParcelasAntecipaveis(Integer numeroParcelasAntecipaveis) {
    this.numeroParcelasAntecipaveis = numeroParcelasAntecipaveis;
  }

  
  /**
   * Nome do estabelecimento da compra
   **/
  @ApiModelProperty(value = "Nome do estabelecimento da compra")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Tipo de transa\u00E7\u00E3o da compra
   **/
  @ApiModelProperty(value = "Tipo de transa\u00E7\u00E3o da compra")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * Cidade onde a compra foi realizada
   **/
  @ApiModelProperty(value = "Cidade onde a compra foi realizada")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Pa\u00EDs onde a compra foi realizada
   **/
  @ApiModelProperty(value = "Pa\u00EDs onde a compra foi realizada")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Coordenada latitudinal da localiza\u00E7\u00E3o da compra
   **/
  @ApiModelProperty(value = "Coordenada latitudinal da localiza\u00E7\u00E3o da compra")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Coordenada longitudinal da localiza\u00E7\u00E3o da compra
   **/
  @ApiModelProperty(value = "Coordenada longitudinal da localiza\u00E7\u00E3o da compra")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Grupo MCC da compra
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Grupo MCC da compra")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Descri\u00E7\u00E3o do Grupo MCC da compra
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Grupo MCC da compra")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da conta da compra
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da conta da compra")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do produto da compra
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do produto da compra")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Descri\u00E7\u00E3o do produto da compra
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do produto da compra")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o da compra
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o da compra")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Nome do portador do cart\u00E3o da compra
   **/
  @ApiModelProperty(value = "Nome do portador do cart\u00E3o da compra")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * Tipo do evento
   **/
  @ApiModelProperty(value = "Tipo do evento")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
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
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
