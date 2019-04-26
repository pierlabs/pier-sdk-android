package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente")
public class TipoDebitoRecorrenteResponse  {
  
  @SerializedName("flagAnuidadeBonificada")
  private Boolean flagAnuidadeBonificada = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("valorBonus")
  private BigDecimal valorBonus = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("flagAdereAutomatico")
  private Boolean flagAdereAutomatico = null;
  @SerializedName("flagGeraNumeroSorte")
  private Boolean flagGeraNumeroSorte = null;
  @SerializedName("faixaEtaria")
  private String faixaEtaria = null;
  @SerializedName("flagSeguro")
  private Boolean flagSeguro = null;
  @SerializedName("sorteiosMensais")
  private String sorteiosMensais = null;
  @SerializedName("flagAdesaoAutomatica")
  private Boolean flagAdesaoAutomatica = null;
  @SerializedName("flagDependente")
  private Boolean flagDependente = null;
  @SerializedName("quantidadeDependente")
  private Integer quantidadeDependente = null;
  @SerializedName("idTermoSeguroServico")
  private Long idTermoSeguroServico = null;
  @SerializedName("idadeMinima")
  private Integer idadeMinima = null;
  @SerializedName("idadeMaxima")
  private Integer idadeMaxima = null;
  @SerializedName("flagDebitoIncondicional")
  private Boolean flagDebitoIncondicional = null;
  @SerializedName("flagExtratoIncondicional")
  private Boolean flagExtratoIncondicional = null;
  @SerializedName("flagEstornoAutomatico")
  private Boolean flagEstornoAutomatico = null;
  @SerializedName("valorRepassadoSeguradora")
  private BigDecimal valorRepassadoSeguradora = null;
  @SerializedName("flagLancaTransacao")
  private Boolean flagLancaTransacao = null;
  @SerializedName("flagTransferenciaAutomatica")
  private Boolean flagTransferenciaAutomatica = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idGrupoDebitoRecorrente")
  private Long idGrupoDebitoRecorrente = null;
  @SerializedName("quantidadeTentativasCobranca")
  private Integer quantidadeTentativasCobranca = null;
  @SerializedName("idAjuste")
  private Long idAjuste = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagAnuidadeBonificada() {
    return flagAnuidadeBonificada;
  }
  public void setFlagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Valor do tipo de d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Valor do tipo de d\u00E9bito recorrente")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Valor do bonus referente ao plano
   **/
  @ApiModelProperty(value = "Valor do bonus referente ao plano")
  public BigDecimal getValorBonus() {
    return valorBonus;
  }
  public void setValorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
  }

  
  /**
   * Numero de parcelas referente ao plano
   **/
  @ApiModelProperty(value = "Numero de parcelas referente ao plano")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica
   **/
  @ApiModelProperty(value = "Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica")
  public Boolean getFlagAdereAutomatico() {
    return flagAdereAutomatico;
  }
  public void setFlagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
  }

  
  /**
   * Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica
   **/
  @ApiModelProperty(value = "Flag que indica se a renova\u00E7\u00E3o vai ser autom\u00E1tica")
  public Boolean getFlagGeraNumeroSorte() {
    return flagGeraNumeroSorte;
  }
  public void setFlagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
  }

  
  /**
   * Indica a faixa et\u00E1ria para aderir ao plano
   **/
  @ApiModelProperty(value = "Indica a faixa et\u00E1ria para aderir ao plano")
  public String getFaixaEtaria() {
    return faixaEtaria;
  }
  public void setFaixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  
  /**
   * Flag indica se o plano \u00E9 um seguro
   **/
  @ApiModelProperty(value = "Flag indica se o plano \u00E9 um seguro")
  public Boolean getFlagSeguro() {
    return flagSeguro;
  }
  public void setFlagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
  }

  
  /**
   * Indica qual premia\u00E7\u00E3o referente ao m\u00EAs
   **/
  @ApiModelProperty(value = "Indica qual premia\u00E7\u00E3o referente ao m\u00EAs")
  public String getSorteiosMensais() {
    return sorteiosMensais;
  }
  public void setSorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
  }

  
  /**
   * Flag que indica se a ades\u00E3o do plano ser\u00E1 autom\u00E1tica
   **/
  @ApiModelProperty(value = "Flag que indica se a ades\u00E3o do plano ser\u00E1 autom\u00E1tica")
  public Boolean getFlagAdesaoAutomatica() {
    return flagAdesaoAutomatica;
  }
  public void setFlagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
  }

  
  /**
   * Flag indica se o plano cobre dependente
   **/
  @ApiModelProperty(value = "Flag indica se o plano cobre dependente")
  public Boolean getFlagDependente() {
    return flagDependente;
  }
  public void setFlagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
  }

  
  /**
   * Indica numeros de dependentes
   **/
  @ApiModelProperty(value = "Indica numeros de dependentes")
  public Integer getQuantidadeDependente() {
    return quantidadeDependente;
  }
  public void setQuantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do termo seguro servi\u00E7o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do termo seguro servi\u00E7o (id)")
  public Long getIdTermoSeguroServico() {
    return idTermoSeguroServico;
  }
  public void setIdTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
  }

  
  /**
   * Idade minima para aderir ao plano
   **/
  @ApiModelProperty(value = "Idade minima para aderir ao plano")
  public Integer getIdadeMinima() {
    return idadeMinima;
  }
  public void setIdadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  
  /**
   * Idade m\u00E1xima para aderir ao plano
   **/
  @ApiModelProperty(value = "Idade m\u00E1xima para aderir ao plano")
  public Integer getIdadeMaxima() {
    return idadeMaxima;
  }
  public void setIdadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
  }

  
  /**
   * Flag indica se o plano ter\u00E1 um debito incondicional
   **/
  @ApiModelProperty(value = "Flag indica se o plano ter\u00E1 um debito incondicional")
  public Boolean getFlagDebitoIncondicional() {
    return flagDebitoIncondicional;
  }
  public void setFlagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
  }

  
  /**
   * Flag indica se o plano ter\u00E1 extrato incondicional
   **/
  @ApiModelProperty(value = "Flag indica se o plano ter\u00E1 extrato incondicional")
  public Boolean getFlagExtratoIncondicional() {
    return flagExtratoIncondicional;
  }
  public void setFlagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
  }

  
  /**
   * Flag indica se o plano ter\u00E1 algum estorno autom\u00E1tico
   **/
  @ApiModelProperty(value = "Flag indica se o plano ter\u00E1 algum estorno autom\u00E1tico")
  public Boolean getFlagEstornoAutomatico() {
    return flagEstornoAutomatico;
  }
  public void setFlagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
  }

  
  /**
   * Valor repassado a seguradora
   **/
  @ApiModelProperty(value = "Valor repassado a seguradora")
  public BigDecimal getValorRepassadoSeguradora() {
    return valorRepassadoSeguradora;
  }
  public void setValorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
  }

  
  /**
   * Flag que indica se vai ser lan\u00E7ado uma transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Flag que indica se vai ser lan\u00E7ado uma transa\u00E7\u00E3o")
  public Boolean getFlagLancaTransacao() {
    return flagLancaTransacao;
  }
  public void setFlagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
  }

  
  /**
   * Flag que indica se vai ser feito transfer\u00EAncia autom\u00E1tica
   **/
  @ApiModelProperty(value = "Flag que indica se vai ser feito transfer\u00EAncia autom\u00E1tica")
  public Boolean getFlagTransferenciaAutomatica() {
    return flagTransferenciaAutomatica;
  }
  public void setFlagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de produtos (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o de produtos (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do grupo de d\u00E9bito recorrente (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do grupo de d\u00E9bito recorrente (id)")
  public Long getIdGrupoDebitoRecorrente() {
    return idGrupoDebitoRecorrente;
  }
  public void setIdGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
  }

  
  /**
   * Qauntidade de tentativas para conbran\u00E7a
   **/
  @ApiModelProperty(value = "Qauntidade de tentativas para conbran\u00E7a")
  public Integer getQuantidadeTentativasCobranca() {
    return quantidadeTentativasCobranca;
  }
  public void setQuantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de tipos de ajuste (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o de tipos de ajuste (id)")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDebitoRecorrenteResponse {\n");
    
    sb.append("  flagAnuidadeBonificada: ").append(flagAnuidadeBonificada).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  valorBonus: ").append(valorBonus).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  flagAdereAutomatico: ").append(flagAdereAutomatico).append("\n");
    sb.append("  flagGeraNumeroSorte: ").append(flagGeraNumeroSorte).append("\n");
    sb.append("  faixaEtaria: ").append(faixaEtaria).append("\n");
    sb.append("  flagSeguro: ").append(flagSeguro).append("\n");
    sb.append("  sorteiosMensais: ").append(sorteiosMensais).append("\n");
    sb.append("  flagAdesaoAutomatica: ").append(flagAdesaoAutomatica).append("\n");
    sb.append("  flagDependente: ").append(flagDependente).append("\n");
    sb.append("  quantidadeDependente: ").append(quantidadeDependente).append("\n");
    sb.append("  idTermoSeguroServico: ").append(idTermoSeguroServico).append("\n");
    sb.append("  idadeMinima: ").append(idadeMinima).append("\n");
    sb.append("  idadeMaxima: ").append(idadeMaxima).append("\n");
    sb.append("  flagDebitoIncondicional: ").append(flagDebitoIncondicional).append("\n");
    sb.append("  flagExtratoIncondicional: ").append(flagExtratoIncondicional).append("\n");
    sb.append("  flagEstornoAutomatico: ").append(flagEstornoAutomatico).append("\n");
    sb.append("  valorRepassadoSeguradora: ").append(valorRepassadoSeguradora).append("\n");
    sb.append("  flagLancaTransacao: ").append(flagLancaTransacao).append("\n");
    sb.append("  flagTransferenciaAutomatica: ").append(flagTransferenciaAutomatica).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idGrupoDebitoRecorrente: ").append(idGrupoDebitoRecorrente).append("\n");
    sb.append("  quantidadeTentativasCobranca: ").append(quantidadeTentativasCobranca).append("\n");
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
