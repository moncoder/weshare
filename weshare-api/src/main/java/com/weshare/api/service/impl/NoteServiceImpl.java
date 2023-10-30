package com.weshare.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weshare.api.service.INoteService;
import com.weshare.mbg.entity.Note;
import com.weshare.mbg.mapper.NoteMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Moncoder
 * @since 2023-10-30 18:56:23
 */
@Service
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements INoteService {

}
