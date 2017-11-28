package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class AntecipacaoResponse  {
  
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCompra")
  private Long idCompra = null;
  @SerializedName("quantidadeParcelasTotal")
  private Long quantidadeParcelasTotal = null;
  @SerializedName("quantidadeParcelasAntecipadas")
  private Long quantidadeParcelasAntecipadas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorDescontoTotal")
  private BigDecimal valorDescontoTotal = null;
  @SerializedName("valorTotalComDesconto")
  private BigDecimal valorTotalComDesconto = null;
  @SerializedName("taxaDesconto")
  private BigDecimal taxaDesconto = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("status")
  private String status = null;
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
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;
  @SerializedName("descricaoEstabelecimento")
  private String descricaoEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;

  
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da compra
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da compra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Apresenta o numero total de parcelas da compra
   **/
  @ApiModelProperty(value = "Apresenta o numero total de parcelas da compra")
  public Long getQuantidadeParcelasTotal() {
    return quantidadeParcelasTotal;
  }
  public void setQuantidadeParcelasTotal(Long quantidadeParcelasTotal) {
    this.quantidadeParcelasTotal = quantidadeParcelasTotal;
  }

  
  /**
   * Apresenta o numero de parcelas antecipadas
   **/
  @ApiModelProperty(value = "Apresenta o numero de parcelas antecipadas")
  public Long getQuantidadeParcelasAntecipadas() {
    return quantidadeParcelasAntecipadas;
  }
  public void setQuantidadeParcelasAntecipadas(Long quantidadeParcelasAntecipadas) {
    this.quantidadeParcelasAntecipadas = quantidadeParcelasAntecipadas;
  }

  
  /**
   * Apresenta o valor de cada parcela antecipadas
   **/
  @ApiModelProperty(value = "Apresenta o valor de cada parcela antecipadas")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Apresenta o valor total do desconto
   **/
  @ApiModelProperty(value = "Apresenta o valor total do desconto")
  public BigDecimal getValorDescontoTotal() {
    return valorDescontoTotal;
  }
  public void setValorDescontoTotal(BigDecimal valorDescontoTotal) {
    this.valorDescontoTotal = valorDescontoTotal;
  }

  
  /**
   * Apresenta o valor total com desconto
   **/
  @ApiModelProperty(value = "Apresenta o valor total com desconto")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * Apresenta a taxa de desconto
   **/
  @ApiModelProperty(value = "Apresenta a taxa de desconto")
  public BigDecimal getTaxaDesconto() {
    return taxaDesconto;
  }
  public void setTaxaDesconto(BigDecimal taxaDesconto) {
    this.taxaDesconto = taxaDesconto;
  }

  
  /**
   * Data da compra.
   **/
  @ApiModelProperty(value = "Data da compra.")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Nome do estabelecimento da compra.
   **/
  @ApiModelProperty(value = "Nome do estabelecimento da compra.")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Tipo de transa\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  @ApiModelProperty(value = "Tipo de transa\u00C3\u00A7\u00C3\u00A3o da compra.")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * Cidade onde a compra foi realizada.
   **/
  @ApiModelProperty(value = "Cidade onde a compra foi realizada.")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Pa\u00C3\u00ADs onde a compra foi realizada.
   **/
  @ApiModelProperty(value = "Pa\u00C3\u00ADs onde a compra foi realizada.")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Coordenada latitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  @ApiModelProperty(value = "Coordenada latitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Coordenada longitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  @ApiModelProperty(value = "Coordenada longitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do produto da compra.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do produto da compra.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do produto da compra.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do produto da compra.")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento da compra.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento da compra.")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Nome fantasia do estabelecimento da compra.
   **/
  @ApiModelProperty(value = "Nome fantasia do estabelecimento da compra.")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoResponse {\n");
    
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCompra: ").append(idCompra).append("\n");
    sb.append("  quantidadeParcelasTotal: ").append(quantidadeParcelasTotal).append("\n");
    sb.append("  quantidadeParcelasAntecipadas: ").append(quantidadeParcelasAntecipadas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorDescontoTotal: ").append(valorDescontoTotal).append("\n");
    sb.append("  valorTotalComDesconto: ").append(valorTotalComDesconto).append("\n");
    sb.append("  taxaDesconto: ").append(taxaDesconto).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  tipoOrigemTransacao: ").append(tipoOrigemTransacao).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  descricaoProduto: ").append(descricaoProduto).append("\n");
    sb.append("  descricaoEstabelecimento: ").append(descricaoEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


