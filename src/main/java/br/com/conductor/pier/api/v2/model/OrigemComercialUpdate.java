package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{origem_comercial_update_description}}}
 **/
@ApiModel(description = "{{{origem_comercial_update_description}}}")
public class OrigemComercialUpdate  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoOrigemComercial")
  private Long idTipoOrigemComercial = null;
  @SerializedName("idGrupoOrigemComercial")
  private Long idGrupoOrigemComercial = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("flagPreAprovado")
  private Boolean flagPreAprovado = null;
  @SerializedName("flagAprovacaoImediata")
  private Boolean flagAprovacaoImediata = null;
  @SerializedName("nomeFantasiaPlastico")
  private String nomeFantasiaPlastico = null;
  @SerializedName("flagCartaoProvisorio")
  private Boolean flagCartaoProvisorio = null;
  @SerializedName("flagCartaoDefinitivo")
  private Boolean flagCartaoDefinitivo = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("flagOrigemExterna")
  private Boolean flagOrigemExterna = null;
  @SerializedName("flagModificado")
  private Boolean flagModificado = null;
  @SerializedName("flagEnviaFaturaUsuario")
  private Boolean flagEnviaFaturaUsuario = null;
  @SerializedName("flagCreditoFaturamento")
  private Boolean flagCreditoFaturamento = null;
  @SerializedName("flagConcedeLimiteProvisorio")
  private Boolean flagConcedeLimiteProvisorio = null;
  @SerializedName("flagDigitalizarDoc")
  private Boolean flagDigitalizarDoc = null;
  @SerializedName("flagEmbossingLoja")
  private Boolean flagEmbossingLoja = null;
  @SerializedName("flagConsultaPrevia")
  private Boolean flagConsultaPrevia = null;
  public enum TipoPessoaEnum {
     PESSOA_FISICA,  PESSOA_JURIDICA, 
  };
  @SerializedName("tipoPessoa")
  private TipoPessoaEnum tipoPessoa = null;

  
  /**
   * {{{origem_comercial_update_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{origem_comercial_update_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{origem_comercial_update_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{origem_comercial_update_id_tipo_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_id_tipo_origem_comercial_value}}}")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * {{{origem_comercial_update_id_grupo_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_id_grupo_origem_comercial_value}}}")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * {{{origem_comercial_update_status_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{origem_comercial_update_flag_pre_aprovado_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_pre_aprovado_value}}}")
  public Boolean getFlagPreAprovado() {
    return flagPreAprovado;
  }
  public void setFlagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
  }

  
  /**
   * {{{origem_comercial_update_flag_aprovacao_imediata_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_aprovacao_imediata_value}}}")
  public Boolean getFlagAprovacaoImediata() {
    return flagAprovacaoImediata;
  }
  public void setFlagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
  }

  
  /**
   * {{{origem_comercial_update_nome_fantasia_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_nome_fantasia_plastico_value}}}")
  public String getNomeFantasiaPlastico() {
    return nomeFantasiaPlastico;
  }
  public void setNomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
  }

  
  /**
   * {{{origem_comercial_update_flag_cartao_provisorio_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_cartao_provisorio_value}}}")
  public Boolean getFlagCartaoProvisorio() {
    return flagCartaoProvisorio;
  }
  public void setFlagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
  }

  
  /**
   * {{{origem_comercial_update_flag_cartao_definitivo_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_cartao_definitivo_value}}}")
  public Boolean getFlagCartaoDefinitivo() {
    return flagCartaoDefinitivo;
  }
  public void setFlagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
  }

  
  /**
   * {{{origem_comercial_update_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{origem_comercial_update_senha_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_senha_value}}}")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{origem_comercial_update_flag_origem_externa_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_origem_externa_value}}}")
  public Boolean getFlagOrigemExterna() {
    return flagOrigemExterna;
  }
  public void setFlagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
  }

  
  /**
   * {{{origem_comercial_update_flag_modificado_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_modificado_value}}}")
  public Boolean getFlagModificado() {
    return flagModificado;
  }
  public void setFlagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
  }

  
  /**
   * {{{origem_comercial_update_flag_envia_fatura_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_envia_fatura_usuario_value}}}")
  public Boolean getFlagEnviaFaturaUsuario() {
    return flagEnviaFaturaUsuario;
  }
  public void setFlagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
  }

  
  /**
   * {{{origem_comercial_update_flag_credito_faturamento_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_credito_faturamento_value}}}")
  public Boolean getFlagCreditoFaturamento() {
    return flagCreditoFaturamento;
  }
  public void setFlagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
  }

  
  /**
   * {{{origem_comercial_update_flag_concede_limite_provisorio_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_concede_limite_provisorio_value}}}")
  public Boolean getFlagConcedeLimiteProvisorio() {
    return flagConcedeLimiteProvisorio;
  }
  public void setFlagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
  }

  
  /**
   * {{{origem_comercial_update_flag_digitalizar_doc_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_digitalizar_doc_value}}}")
  public Boolean getFlagDigitalizarDoc() {
    return flagDigitalizarDoc;
  }
  public void setFlagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
  }

  
  /**
   * {{{origem_comercial_update_flag_embossing_loja_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_embossing_loja_value}}}")
  public Boolean getFlagEmbossingLoja() {
    return flagEmbossingLoja;
  }
  public void setFlagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
  }

  
  /**
   * {{{origem_comercial_update_flag_consulta_previa_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_flag_consulta_previa_value}}}")
  public Boolean getFlagConsultaPrevia() {
    return flagConsultaPrevia;
  }
  public void setFlagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
  }

  
  /**
   * {{{origem_comercial_update_tipo_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{origem_comercial_update_tipo_pessoa_value}}}")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoOrigemComercial: ").append(idTipoOrigemComercial).append("\n");
    sb.append("  idGrupoOrigemComercial: ").append(idGrupoOrigemComercial).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  flagPreAprovado: ").append(flagPreAprovado).append("\n");
    sb.append("  flagAprovacaoImediata: ").append(flagAprovacaoImediata).append("\n");
    sb.append("  nomeFantasiaPlastico: ").append(nomeFantasiaPlastico).append("\n");
    sb.append("  flagCartaoProvisorio: ").append(flagCartaoProvisorio).append("\n");
    sb.append("  flagCartaoDefinitivo: ").append(flagCartaoDefinitivo).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  flagOrigemExterna: ").append(flagOrigemExterna).append("\n");
    sb.append("  flagModificado: ").append(flagModificado).append("\n");
    sb.append("  flagEnviaFaturaUsuario: ").append(flagEnviaFaturaUsuario).append("\n");
    sb.append("  flagCreditoFaturamento: ").append(flagCreditoFaturamento).append("\n");
    sb.append("  flagConcedeLimiteProvisorio: ").append(flagConcedeLimiteProvisorio).append("\n");
    sb.append("  flagDigitalizarDoc: ").append(flagDigitalizarDoc).append("\n");
    sb.append("  flagEmbossingLoja: ").append(flagEmbossingLoja).append("\n");
    sb.append("  flagConsultaPrevia: ").append(flagConsultaPrevia).append("\n");
    sb.append("  tipoPessoa: ").append(tipoPessoa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
