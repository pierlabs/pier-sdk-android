package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoDetalhesPersist;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{arquivo_persist_description}}}
 **/
@ApiModel(description = "{{{arquivo_persist_description}}}")
public class ArquivoPersist  {
  
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("arquivo")
  private String arquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
  public enum TipoComunicacaoEnum {
     SOAP,  REST, 
  };
  @SerializedName("tipoComunicacao")
  private TipoComunicacaoEnum tipoComunicacao = null;
  @SerializedName("detalhes")
  private List<ArquivoDetalhesPersist> detalhes = null;

  
  /**
   * {{{arquivo_persist_id_tipo_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_persist_id_tipo_arquivo_value}}}")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * {{{arquivo_persist_arquivo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{arquivo_persist_arquivo_value}}}")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * {{{arquivo_persist_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_persist_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{arquivo_persist_extensao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_persist_extensao_value}}}")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{arquivo_persist_tipo_comunicacao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_persist_tipo_comunicacao_value}}}")
  public TipoComunicacaoEnum getTipoComunicacao() {
    return tipoComunicacao;
  }
  public void setTipoComunicacao(TipoComunicacaoEnum tipoComunicacao) {
    this.tipoComunicacao = tipoComunicacao;
  }

  
  /**
   * {{{arquivo_persist_detalhes_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{arquivo_persist_detalhes_value}}}")
  public List<ArquivoDetalhesPersist> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoDetalhesPersist> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoPersist {\n");
    
    sb.append("  idTipoArquivo: ").append(idTipoArquivo).append("\n");
    sb.append("  arquivo: ").append(arquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  tipoComunicacao: ").append(tipoComunicacao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


